// Configuração da API
const API_BASE_URL = '/api';

// Utilitários
class ApiService {
    static async get(endpoint) {
        try {
            const response = await fetch(`${API_BASE_URL}${endpoint}`);
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return await response.json();
        } catch (error) {
            console.error('Erro na requisição GET:', error);
            throw error;
        }
    }

    static async post(endpoint, data) {
        try {
            const response = await fetch(`${API_BASE_URL}${endpoint}`, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(data)
            });
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return await response.json();
        } catch (error) {
            console.error('Erro na requisição POST:', error);
            throw error;
        }
    }

    static async put(endpoint, data) {
        try {
            const response = await fetch(`${API_BASE_URL}${endpoint}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(data)
            });
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return await response.json();
        } catch (error) {
            console.error('Erro na requisição PUT:', error);
            throw error;
        }
    }

    static async delete(endpoint) {
        try {
            const response = await fetch(`${API_BASE_URL}${endpoint}`, {
                method: 'DELETE'
            });
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.status === 204 ? null : await response.json();
        } catch (error) {
            console.error('Erro na requisição DELETE:', error);
            throw error;
        }
    }
}

// Utilitários de UI
class UIUtils {
    static showLoading(containerId) {
        const container = document.getElementById(containerId);
        if (container) {
            container.innerHTML = '<div class="loading">Carregando...</div>';
        }
    }

    static showError(containerId, message) {
        const container = document.getElementById(containerId);
        if (container) {
            container.innerHTML = `<div class="error-message">${message}</div>`;
        }
    }

    static showSuccess(containerId, message) {
        const container = document.getElementById(containerId);
        if (container) {
            container.innerHTML = `<div class="success-message">${message}</div>`;
        }
    }

    static formatDate(dateString) {
        const date = new Date(dateString);
        return date.toLocaleDateString('pt-BR');
    }

    static formatCurrency(value) {
        return new Intl.NumberFormat('pt-BR', {
            style: 'currency',
            currency: 'BRL'
        }).format(value);
    }
}

// Classe para gerenciar usuarios
class UserManager {
    static async loadUsers() {
        try {
            UIUtils.showLoading('users-container');
            const users = await ApiService.get('/users');
            this.renderUsers(users);
        } catch (error) {
            UIUtils.showError('users-container', 'Erro ao carregar usuários: ' + error.message);
        }
    }

    static renderUsers(users) {
        const container = document.getElementById('users-container');
        if (!container) return;

        if (users.length === 0) {
            container.innerHTML = '<div class="text-center">Nenhum usuário encontrado.</div>';
            return;
        }

        const tableHTML = `
            <div class="table-container">
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>Email</th>
                            <th>Telefone</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        ${users.map(user => `
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.name}</td>
                                <td>${user.email}</td>
                                <td>${user.phone || 'N/A'}</td>
                                <td>
                                    <button class="btn btn-secondary" onclick="UserManager.editUser(${user.id})">Editar</button>
                                    <button class="btn btn-danger" onclick="UserManager.deleteUser(${user.id})">Excluir</button>
                                </td>
                            </tr>
                        `).join('')}
                    </tbody>
                </table>
            </div>
        `;

        container.innerHTML = tableHTML;
    }

    static async deleteUser(id) {
        if (confirm('Tem certeza que deseja excluir este usuário?')) {
            try {
                await ApiService.delete(`/users/${id}`);
                UIUtils.showSuccess('users-container', 'Usuário excluído com sucesso!');
                setTimeout(() => this.loadUsers(), 1500);
            } catch (error) {
                UIUtils.showError('users-container', 'Erro ao excluir usuário: ' + error.message);
            }
        }
    }

    static editUser(id) {
        // Implementação futura para edição
        alert(`Funcionalidade de edição será implementada. ID: ${id}`);
    }
}

// Classe para gerenciar produtos
class ProductManager {
    static async loadProducts() {
        try {
            UIUtils.showLoading('products-container');
            const products = await ApiService.get('/products');
            this.renderProducts(products);
        } catch (error) {
            UIUtils.showError('products-container', 'Erro ao carregar produtos: ' + error.message);
        }
    }

    static renderProducts(products) {
        const container = document.getElementById('products-container');
        if (!container) return;

        if (products.length === 0) {
            container.innerHTML = '<div class="text-center">Nenhum produto encontrado.</div>';
            return;
        }

        const cardsHTML = `
            <div class="cards-grid">
                ${products.map(product => `
                    <div class="card">
                        <h3>${product.name}</h3>
                        <p><strong>Descrição:</strong> ${product.description}</p>
                        <p><strong>Preço:</strong> ${UIUtils.formatCurrency(product.price)}</p>
                        <p><strong>Imagem:</strong> <img src="${product.imgUrl}" alt="${product.name}" style="max-width: 100px; border-radius: 5px;"></p>
                    </div>
                `).join('')}
            </div>
        `;

        container.innerHTML = cardsHTML;
    }
}

// Classe para gerenciar pedidos
class OrderManager {
    static async loadOrders() {
        try {
            UIUtils.showLoading('orders-container');
            const orders = await ApiService.get('/orders');
            this.renderOrders(orders);
        } catch (error) {
            UIUtils.showError('orders-container', 'Erro ao carregar pedidos: ' + error.message);
        }
    }

    static renderOrders(orders) {
        const container = document.getElementById('orders-container');
        if (!container) return;

        if (orders.length === 0) {
            container.innerHTML = '<div class="text-center">Nenhum pedido encontrado.</div>';
            return;
        }

        const tableHTML = `
            <div class="table-container">
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Data</th>
                            <th>Cliente</th>
                            <th>Status</th>
                            <th>Total</th>
                        </tr>
                    </thead>
                    <tbody>
                        ${orders.map(order => `
                            <tr>
                                <td>${order.id}</td>
                                <td>${UIUtils.formatDate(order.moment)}</td>
                                <td>${order.client ? order.client.name : 'N/A'}</td>
                                <td>${order.orderStatus}</td>
                                <td>${order.total ? UIUtils.formatCurrency(order.total) : 'N/A'}</td>
                            </tr>
                        `).join('')}
                    </tbody>
                </table>
            </div>
        `;

        container.innerHTML = tableHTML;
    }
}

// Classe para gerenciar categorias
class CategoryManager {
    static async loadCategories() {
        try {
            UIUtils.showLoading('categories-container');
            const categories = await ApiService.get('/categories');
            this.renderCategories(categories);
        } catch (error) {
            UIUtils.showError('categories-container', 'Erro ao carregar categorias: ' + error.message);
        }
    }

    static renderCategories(categories) {
        const container = document.getElementById('categories-container');
        if (!container) return;

        if (categories.length === 0) {
            container.innerHTML = '<div class="text-center">Nenhuma categoria encontrada.</div>';
            return;
        }

        const cardsHTML = `
            <div class="cards-grid">
                ${categories.map(category => `
                    <div class="card">
                        <h3>${category.name}</h3>
                        <p><strong>ID:</strong> ${category.id}</p>
                    </div>
                `).join('')}
            </div>
        `;

        container.innerHTML = cardsHTML;
    }
}

// Menu responsivo
class MobileMenu {
    static init() {
        const menuToggle = document.querySelector('.menu-toggle');
        const navMenu = document.querySelector('.nav-menu');

        if (menuToggle && navMenu) {
            menuToggle.addEventListener('click', () => {
                navMenu.classList.toggle('active');
            });

            // Fechar menu ao clicar em um link
            navMenu.addEventListener('click', (e) => {
                if (e.target.tagName === 'A') {
                    navMenu.classList.remove('active');
                }
            });

            // Fechar menu ao redimensionar para desktop
            window.addEventListener('resize', () => {
                if (window.innerWidth > 768) {
                    navMenu.classList.remove('active');
                }
            });
        }
    }
}

// Dashboard
class Dashboard {
    static async loadStats() {
        try {
            const container = document.getElementById('dashboard-stats');
            if (!container) return;

            UIUtils.showLoading('dashboard-stats');

            const [users, products, orders, categories] = await Promise.all([
                ApiService.get('/users'),
                ApiService.get('/products'),
                ApiService.get('/orders'),
                ApiService.get('/categories')
            ]);

            const statsHTML = `
                <div class="cards-grid">
                    <div class="card text-center">
                        <h3>${users.length}</h3>
                        <p>Usuários</p>
                    </div>
                    <div class="card text-center">
                        <h3>${products.length}</h3>
                        <p>Produtos</p>
                    </div>
                    <div class="card text-center">
                        <h3>${orders.length}</h3>
                        <p>Pedidos</p>
                    </div>
                    <div class="card text-center">
                        <h3>${categories.length}</h3>
                        <p>Categorias</p>
                    </div>
                </div>
            `;

            container.innerHTML = statsHTML;
        } catch (error) {
            UIUtils.showError('dashboard-stats', 'Erro ao carregar estatísticas: ' + error.message);
        }
    }
}

// Destacar menu ativo
function highlightActiveMenu() {
    const currentPath = window.location.pathname;
    const menuLinks = document.querySelectorAll('.nav-menu a');
    
    menuLinks.forEach(link => {
        link.classList.remove('active');
        if (link.getAttribute('href') === currentPath || 
            (currentPath === '/' && link.getAttribute('href') === '/')) {
            link.classList.add('active');
        }
    });
}

// Inicialização
document.addEventListener('DOMContentLoaded', () => {
    MobileMenu.init();
    highlightActiveMenu();
    
    // Adicionar animação fade-in aos cards
    const cards = document.querySelectorAll('.card');
    cards.forEach((card, index) => {
        setTimeout(() => {
            card.classList.add('fade-in');
        }, index * 100);
    });
});