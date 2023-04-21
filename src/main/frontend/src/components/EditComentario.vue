<script setup></script>
<template>
    <div class="wrapper">
        <v-avatar class="avatar" size="60">
            <v-img contain aspect-ratio="16/9" src="../src/assets/images/avatar2.png" alt="avatar-user"></v-img>
        </v-avatar>
        <div class="btn">
            <v-btn variant="tonal" class="submit" onclick="submit">
                SUBMIT
            </v-btn>
            <v-btn variant="tonal" class="mr-5" onclick="cancel">
                CANCEL
            </v-btn>
        </div>
    </div>
    </template>
    <style lang="scss" scoped>
    .wrapper {
        background-color: whitesmoke;
        width: 500px;
        height: 150px;
        border-radius: 10px;
        border: 2px solid black;
    
        .avatar {
            bottom: 25px;
            right: 12px;
        }
    
        .btn {
            display: flex;
            justify-content: flex-end;
            gap: 10px;
            top: 27px;
            position: relative;
    
        }
    }
    </style>

            
