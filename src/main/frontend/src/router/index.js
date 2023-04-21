import { createRouter, createWebHistory } from 'vue-router'
import LandingView from '../views/LandingView.vue'
import Dashboard from '../views/Dashboardview.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: LandingView
    },
    {
      path: '/dashboard',
      name: 'Dashboard',
      // component: () => import('../views/DashboardView.vue')
      component: Dashboard
    }
  ]
})



export default router;