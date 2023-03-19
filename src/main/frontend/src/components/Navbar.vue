<script>
export default {
  data() {
    return {
      drawer: true,
      items: [
        { title: "Search", icon: "mdi-magnify" },
        { title: "Home", icon: "mdi-home" },
        { title: "Categories", icon: "mdi-view-dashboard" },
      ],
      rail: true,
    };
  },
};
</script>
<template>
  <v-card>
    <v-layout>
      <v-navigation-drawer
        v-model="drawer"
        :rail="rail"
        permanent
        @click="rail = false"
      >
        <v-list-item
          prepend-avatar="../../src/assets/images/logo.png"
          title="RUTEROS"
          nav
        >
          <template v-slot:append>
            <v-btn
              variant="text"
              icon="mdi-chevron-left"
              @click.stop="rail = !rail"
            ></v-btn>
          </template>
        </v-list-item>

        <v-divider></v-divider>

        <v-list density="compact" nav>
          <v-list-item
            prepend-icon="mdi-magnify"
            title="Search"
            value="search"
          ></v-list-item>
          <v-list-item
            prepend-icon="mdi-home"
            title="Home"
            value="home"
          ></v-list-item>
          <v-list-item
            prepend-icon="mdi-view-dashboard"
            title="Categories"
            value="categories"
          ></v-list-item>
        </v-list>
      </v-navigation-drawer>
      <v-main style="height: 95px"><h1>Hola, Ruteros !!!</h1></v-main>
    </v-layout>
  </v-card>
</template>
<style lang="scss" scoped></style>
