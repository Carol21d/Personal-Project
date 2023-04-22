<script setup>
</script>

<template>
  <v-layout >
    <v-card>
      <v-navigation-drawer style="width: 70px" color="#006064" expand-on-hover rail>
        <v-list class="justify-center ml-2">
          <v-img width="45" aspect-ratio="16/9" cover src="../../src/assets/images/logo.png" alt="logo-ruteros"></v-img>
        </v-list>
        <v-list density="default" nav>
          <v-list-item-group>
            <v-list-item>
              <router-link to="/search">
                <v-icon size="x-large" color="#000000" icon="mdi-magnify"></v-icon>
              </router-link>
            </v-list-item>

            <v-list-item>
              <router-link to="/dashboard">
                <v-icon style="height: 90px" size="x-large" color="#000000" icon="mdi-home"></v-icon>
              </router-link>

            </v-list-item>
            <v-list-item>
              <router-link to="/dashboard">
                <v-icon size="x-large" color="#000000" icon="mdi-view-dashboard"></v-icon>
              </router-link>

            </v-list-item>
          </v-list-item-group>
        </v-list>
      </v-navigation-drawer>
      <v-main style="height:250px">
      
      </v-main>
    </v-card>
  </v-layout>
</template>

<style lang="css" scoped>

</style>



        





