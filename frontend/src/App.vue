<template>
  <div id="app" class="research-assistant">
    <div class="animated-bg"></div>
    <div class="background"></div>
    <AppNavBar />
    <router-view />
  </div>
</template>

<script>
import AppNavBar from './components/AppNavBar.vue';

export default {
  name: 'App',
  components: {
    AppNavBar,
  },
};
</script>

<style scoped>
/* 保留你原来的背景样式 */
.research-assistant {
  position: relative;
  min-height: 100vh;
  color: white;
  font-family: 'Arial', sans-serif;
  overflow-x: hidden;
  overflow-y: auto;
}

.background {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  //background: linear-gradient(135deg, #333, #666);
  //background: linear-gradient(135deg, #57819b, #132234);
  background: linear-gradient(135deg, #4e7d9b, #132234);
  //background: linear-gradient(135deg, #4e7d9b, #032d50);
  z-index: -1;
}


</style>
