import { createRouter, createWebHistory } from 'vue-router'
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
          path: '/user/edit/:id',
          name: 'edituser',
          component: () => import('../views/UpdateUser.vue')
        }

  ]
})

export default router
