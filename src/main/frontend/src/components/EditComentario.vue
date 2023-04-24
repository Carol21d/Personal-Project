<script setup>
import { commentsStore } from '../stores/commentsUser';
import { ref, defineProps } from 'vue';

const props = defineProps({
    id: {
        type: Number,
        required: true,
    },

    comment: {
        type: String,
        required: true,
    },

    name: {
        type: String,
        required: true,
    },
});


const name = ref(props.name);
const comment = ref(props.comment);
const commentstore = commentsStore();

let editActivada = ref(false);

function editComment() {
    const updateComments = {
        id: props.id,
        name: name.value,
        comment: comment.value,
    };
    commentstore.editComment(updateComments, updateComments.id);
    editActivada.value = false;
};

function updateEdit() {


    (editActivada.value == false) ? editActivada.value = true : editActivada.value = false;
    console.log(editActivada.value);
}


function deleteComment() {
    commentstore.deleteComments(props.id)
}


</script>
<template>
    <div class="wrapper">
        <v-avatar class="avatar" size="80">
            <v-img contain aspect-ratio="16/9" src="../src/assets/images/avatar2.png" alt="avatar-user"></v-img>
        </v-avatar>
        <div class="btn">
            <v-btn variant="tonal" class="btn-edit" color="light-green darken-4" v-on:click="updateEdit()">EDIT</v-btn>
            <v-btn variant="tonal" class="btn-confirmar" color="light-green darken-4" v-if="editActivada == true"
                v-on:click="editComment()">CONFIRMAR</v-btn>
            <v-btn variant="tonal"  class="btn-cancel mr-5" color="red accent-4 " v-on:click="deleteComment()">DELETE</v-btn>
        </div>
        <div class="comment">
            <v-card-text v-if="editActivada === false" class="nameU">User: {{ props.name }}</v-card-text>
            <input placeholder="Name: " type="text" v-if="editActivada === true" v-model="name">
            <v-card-text v-if="editActivada === false" class="textU">Comentario: {{ props.comment }}</v-card-text>
            <input type="text" v-if="editActivada === true" v-model="comment" placeholder="Comment">

        </div>

    </div>
</template>
<style lang="scss" scoped>
.wrapper {
    //     display: flex;
    //     position: relative;
    //     flex-direction: row;
    //     left: 52.7%;
    //    top: 120%;

    display: flex;
    flex-direction: column;
    position: relative;
    top: 43vh;
    align-items: center;
    margin-bottom: 10px;
    background-color: whitesmoke;
    width: 43%;
    height: 25%;
    border-radius: 10px;
    border: 2px solid black;

    .avatar {
        bottom: 5vh;
        right: 1%;
    }

    .btn {
        display: flex;
        position: absolute;
        justify-content: flex-end;
        gap: 7%;
        top: 78%;
        left: 64%;

        .btn-edit{
            display: flex;
            position: relative;
            bottom: 2vh;
        }
        .btn-cancel{
            display: flex;
            position: relative;
            bottom: 2vh;
        }

        .btn-confirmar{
            display: flex;
            position: relative;
            bottom: 2vh;
        }

    }

    .comment {
        display: flex;
        flex-direction: column;
        justify-content: start;
        position: relative;
        bottom:82%;

        .nameU {
            display: flex;
            position: relative;
            bottom: 1vh;
            color: firebrick;
            font-weight: 600;
            font-size: large;
        }

        .textU {
            font-size: large;
            display: flex;
            position: relative;
            bottom: 4vh;
            right: 12%;
            font-family: Verdana, Geneva, Tahoma, sans-serif;

        }




    }
}
</style>
    
    

            
