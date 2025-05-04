<template>
  <div class="app-nav-bar">
    <!-- 欢迎信息 -->
    <div class="welcome">
      <h1>Welcome to Research Assistant</h1>
      <p>Your AI-powered research companion</p>
    </div>

    <!-- 功能导航 -->
    <div class="tabs">
      <button class="tab" :class="{ active: $route.name === 'home' }" @click="goTo('home')">Home</button>
      <button class="tab" :class="{ active: $route.name === 'search' }" @click="goTo('search')">Search</button>
      <button class="tab" :class="{ active: $route.name === 'recommend' }" @click="goTo('recommend')">Recommend</button>
      <button class="tab" :class="{ active: $route.name === 'chat' }" @click="goTo('chat')">Chat</button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AppNavBar',
  methods: {
    goTo(tabName) {
      this.$router.push({ name: tabName });
    },
  },
};
</script>

<style scoped>
.app-nav-bar {
  text-align: center;
  margin-top: 10vh;
  color: white;
  height: 200px;
}

.welcome h1 {
  font-size: 3rem;
  margin-bottom: 1rem;
}

.welcome p {
  font-size: 1.5rem;
  color: #c8c6c6;
  font-family: 'Papyrus', cursive;
}

.tabs {
  display: flex;
  justify-content: center;
  margin-top: 2rem;
  gap: 1rem;
}

.tab {
  background: transparent;
  border: 2px solid white;
  color: white;
  padding: 0.5rem 1rem;
  margin: 0 0.5rem;
  width: 130px;
  height: 40px;
  font-size: 1rem;
  cursor: pointer;
  transition: background 0.3s;
}

.tab:hover,
.tab.active {
  background: white;
  color: #333;
}
</style>
