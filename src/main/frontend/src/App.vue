<script setup>
import { RouterLink, RouterView } from "vue-router";
import HelloWorld from "./components/HelloWorld.vue";
import AquaticView from "./views/Categories/AquaticView.vue";
import Dashboardview from "./views/Dashboardview.vue";
</script>

<template>
  <!-- <Dashboardview /> -->
  <AquaticView/>

  <!-- <header>
  

     <div class="wrapper">
      <HelloWorld msg="You did it!" />

      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav>
    </div> -->
  <!-- </header> -->

  <!-- <RouterView /> -->
</template>

<style scoped></style>
