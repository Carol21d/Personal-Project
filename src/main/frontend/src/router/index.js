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
      path: '/dashboard/id',
      name: 'dashboard',
      component:() => import('@/views/DashboardView.vue')
    },
    {
      path: '/aquatic',
      name: 'aquatic',
      component: () =>import('@/views/AquaticView.vue')
    },
    {
      path: '/bikes',
      name: 'bike',
      component: () =>import('@/views/BikesView.vue')
    },
    {
      path: '/climbing',
      name: 'climbing',
      component: () =>import('@/views/ClimbingView.vue')
    },
    {
      path: '/combined',
      name: 'combined',
      component: () =>import('@/views/CombinedView.vue')
    },
    {
      path: '/mountains',
      name: 'mountains',
      component: () =>import('@/views/MountainsView.vue')
    },
    {
      path: '/pets',
      name: 'pets',
      component: () =>import('@/views/PetsView.vue')
    }

  ]
})



export default router;