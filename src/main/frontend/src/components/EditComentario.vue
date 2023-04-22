<script setup></script>
<template>
    <div class="wrapper">
        <v-avatar class="avatar" size="80">
            <v-img contain aspect-ratio="16/9" src="../src/assets/images/avatar2.png" alt="avatar-user"></v-img>
        </v-avatar>
        <div class="btn">
            <v-btn variant="tonal" class="submit" onclick="submit">SUBMIT</v-btn>
            <v-btn variant="tonal" class="mr-5" onclick="cancel">CANCEL</v-btn>
        </div>
    </div>
    </template>
    <style lang="scss" scoped>
    .wrapper {
        display: flex;
        position: absolute;
        left: 52.7%;
        top: 50%;
        background-color: whitesmoke;
        width: 43%;
        height: 16%;
        border-radius: 10px;
        border: 2px solid black;
        .avatar {
            bottom: 25%;
            right: 1%;
        }
        .btn {
            display: flex;
            position: absolute;
            justify-content: flex-end;
            gap: 10%;
            top: 65%;
            left: 65%;
    
        }
    }
    </style>
    
    

            
