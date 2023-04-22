<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';



const router = useRouter();
const cards = ref([
    {
        id: 1,
        title: "Card 1",
        location: "Location 1",
        image: "https://cdn.vuetifyjs.com/images/cards/docks.jpg",
        icon: "../../src/assets/images/icon-beach.png",
        level: "EASY",
        route:"/about"
    },

    {
        id: 2,
        title: "Card 2",
        location: "Location 2",
        image: "https://cdn.vuetifyjs.com/images/cards/cooking.png",
        icon: "../../src/assets/images/icon-food.png",
        level: "HIGH",
        route:"/about"
    },

    {
        id: 3,
        title: "Card 3",
        location: "Location 3",
        image: "https://cdn.vuetifyjs.com/images/cards/docks.jpg",
        icon: "../../src/assets/images/icon-beach.png",
        level: "MIDDLE",
        route:"/about"
    },

    {
        id: 4,
        title: "Card 4",
        location: "Location 4",
        image: "https://cdn.vuetifyjs.com/images/cards/docks.jpg",
        icon: "../../src/assets/images/icon-beach.png",
        level: "MIDDLE",
        route: "/about"
    },

    {
        id: 5,
        title: "Card 5",
        location: "Location 5",
        description: "lorem ipmaskdhakshdhakshdkhaskdhkahsdkhaksd",
        image: "https://cdn.vuetifyjs.com/images/cards/docks.jpg",
        icon: "../../src/assets/images/icon-beach.png",
        level: "EASY",
        route:"/about"
    },
    {
        id: 6,
        title: "Card 6",
        location: "Location 6",
        description: "lorem ipmaskdhakshdhakshdkhaskdhkahsdkhaksd",
        image: "https://cdn.vuetifyjs.com/images/cards/docks.jpg",
        icon: "../../src/assets/images/icon-beach.png",
        level: "HIGH",
        route: "/about"
    }

]);

const clickAbout = (index) => {
    router.push(cards.value[index].route);
};

</script>
<template>
    <v-container class="nave mx-auto" max-width="1200">
        <v-row>
            <v-col v-for="(card, index) in cards" :key="card.id" cols="4">
                <v-hover v-slot="{ isHovering, props }">
                    <v-card v-bind="props" :elevation="isHovering ? 24 : 6"   class="mx-auto pa-6" max-width="400"   @click="clickAbout(index)">
                        <v-img class="align-end text-white" height="190" src="https://cdn.vuetifyjs.com/images/cards/docks.jpg" cover>
                            <v-card-title>{{ card.title }}</v-card-title>
                        </v-img>
                        <v-card-text>
                            <div>{{ card.location }}</div>

                        </v-card-text>
                        <v-card-actions>
                            <v-list class="justify-center ml-2">
                                <v-img width="35" aspect-ratio="16/9" cover src="../../src/assets/images/icon-beach.png" alt="icon-beach"></v-img>
                            </v-list>
                            <v-btn type="text" class="justify-center ml-10 mt-4 text-h6 text-md-h5 text-lg-h6"
                                color="orange">
                                {{ card.level }}</v-btn>
                        </v-card-actions>
                    </v-card>
                </v-hover>
            </v-col>
        </v-row>
    </v-container>
</template>
<style lang="scss" scoped>
.nave{
    display: flex;
    position: absolute;
    top: 25%;
    left: 10%;
}
</style>




