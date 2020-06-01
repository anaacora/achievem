<template>
  <div class="profile">
    <div class="container-fluid">

        <div class="row mb-3">
            <div class="col d-flex justify-content-center">
                <h3>Anaa</h3>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col d-flex justify-content-center muted">
                <img src="../img/profile_anaa.png" alt="Profile" class="img-profile rounded-circle">
                <div>
                    <i class="fas fa-camera hovering ml-1"></i>
                </div>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <div class="list-group text-center">
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Friends</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Settings</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Notifications</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Change password</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Logout</a>
                </div>
            </div>
        </div>

    </div>
  </div>
</template>

<style scoped>
.img-profile {
    height: 250px;
    width: 250px;
}
</style>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Profile',
  components: {
     // HelloWorld,
  }
}
</script>
