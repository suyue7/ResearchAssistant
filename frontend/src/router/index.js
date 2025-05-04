import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '../views/HomePage.vue'
import SearchView from '../views/SearchView.vue'
import RecommendView from '../views/RecommendView.vue'
import ChatView from '../views/ChatView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage
    },
    {
      path: '/search',
      name: 'search',
      component: SearchView
    },
    {
      path: '/recommend',
      name: 'recommend',
      component: RecommendView
    },
    {
      path: '/chat',
      name: 'chat',
      component: ChatView
    }
  ],
})

export default router
