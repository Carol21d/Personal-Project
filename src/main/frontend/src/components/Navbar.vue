<script setup>
</script>

<template>
  <v-layout>
    <v-card>
      <v-navigation-drawer style="width: 70px" color="#006064" expand-on-hover rail>
        <v-list class="justify-center ml-2">
          <v-img width="45" aspect-ratio="16/9" cover src="../../src/assets/images/logo.png" alt="logo-ruteros"></v-img>
        </v-list>
        <v-list density="default" nav>
          <v-list-item-group>
          <v-list-item :to="{ path: '/search'}">
            <v-icon size="x-large" color="#000000" icon="mdi-magnify"></v-icon>
          </v-list-item>
          <v-list-item :to="{path: '/dashboard'}">
            <v-icon style="height: 90px" size="x-large" color="#000000" icon="mdi-home"></v-icon>
          </v-list-item>
          <v-list-item :to="{path: '/dashboard'}">
            <v-icon size="x-large" color="#000000" icon="mdi-view-dashboard"></v-icon>
          </v-list-item>
        </v-list-item-group>
        </v-list>
      </v-navigation-drawer>
      <v-main style="height:250px">
        <!-- <p class=" title text-lg-h6 mt-5 ml-5 ">HOLA, RUTEROS</p> -->
      </v-main>
    </v-card>
  </v-layout>
</template>

<style lang="scss" scoped>
.title {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-weight: bold;
  font-style: italic;
}
</style>



        





