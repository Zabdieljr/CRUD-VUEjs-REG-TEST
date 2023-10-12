import { createRouter, createWebHistory } from 'vue-router'
import ViewPatients from '../views/ViewPatients.vue'
import ViewUsers from '../views/ViewUsers.vue'
import RegForm from '../views/RegForm.vue'
import AddUser from '../views/AddUser.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('../views/RegForm.vue')
    },
    {
              path: '/employee',
              name: 'employee',
              component: () => import('../views/ViewPatients.vue')
            },
    {
          path: '/user',
          name: 'user',
          component: () => import('../views/ViewUsers.vue')
        },
        {
              path: '/user/add',
              name: 'adduser',
              component: () => import('../views/AddUser.vue')
            },
    {
      path: '/add',
      name: 'add',
      component: () => import('../views/AddPatient.vue')
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: () => import('../views/UpdatePatient.vue')
    },
    {
          path: '/user/edit/:id',
          name: 'edituser',
          component: () => import('../views/UpdateUser.vue')
        }

  ]
})

export default router
