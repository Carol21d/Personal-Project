<script setup>
import Navbar from "../components/Navbar.vue";
import Categories from "../components/Categories.vue";
import RecommendedRoutes from "../components/RecommendedRoutes.vue";
</script>
<template>
  <div>
    <Navbar />
    <v-container fluid>
      <v-row class="main">
        <v-col class="categorias" cols="8">
          <Categories />
        </v-col>
        <v-col cols="4">
          <RecommendedRoutes />
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>
<style lang="scss" scope>
.navbar {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 100;
}
.main {
  margin-left: 20px;
}
</style>
