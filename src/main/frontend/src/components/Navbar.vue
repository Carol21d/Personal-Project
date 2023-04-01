<script>
export default {
  data() {
    return {
      drawer: true,
      items: [
        { title: "Home", icon: "mdi-magnify" },
        { title: "My Account", icon: "mdi-home" },
        { title: "Users", icon: "mdi-view-dashboard" },
      ],
      rail: true,
    };
  },
};
</script>

<template>
  <v-card class="card">
    <v-layout class="test">
      <v-navigation-drawer style="width: 155px" class="navi" v-model="drawer">
        <v-list-item class="foto justify-content-center ml-8" nav>
          <v-img
            :width="70"
            aspect-ratio="16/9"
            cover
            src="../../src/assets/images/logo.png"
          ></v-img>
        </v-list-item>
        <p class="font-weight-black ml-10">Ruteros</p>


        <v-list density="compact" class="list" nav>
          <v-list-item
            prepend-icon="mdi-magnify"
            class="icon__search ml-12"
            value="search"
          ></v-list-item>
          <v-list-item
            prepend-icon="mdi-home"
            class="icon__home ml-12"
            value="home"
          ></v-list-item>
          <v-list-item
            prepend-icon="mdi-view-dashboard"
            class="icon__categories ml-12"
            value="categories"
          ></v-list-item>
        </v-list>
      </v-navigation-drawer>
      <v-main style="height: 900px">
        <p class="font-italic text-lg-h4 mt-10 ">Hola, Ruteros</p>
        <v-img
            
            
            aspect-ratio="16/9"
            cover
            class="sociales"
            src="../../src/assets/images/socialnetwork.png"
          ></v-img>

      </v-main>
    </v-layout>
  </v-card>
</template>

<style lang="scss" scoped>
.sociales{
  width: 10px;
  height: 10px;
}
</style>
