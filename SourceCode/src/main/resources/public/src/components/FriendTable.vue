<template>
  <div class="col border mr-3 ml-2 pt-3 pb-2 rounded">
    <div class="text-center">
      <h5 class="font-weight-bold">
        <span>Your friends</span>
      </h5>
    </div>
    <table class="table table-borderless text-right">
      <tbody>
        <tr class="font-weight-bold">
          <th scope="row" class="text-center">
            <img
              v-bind:src="require('../img/profile_'+[user.user_name]+'.png')"
              alt="Profile"
              class="img-friend-table rounded-circle"
            />
          </th>
          <td class="text-left align-middle">{{user.user_name}}</td>
          <td class="align-middle">{{user.total_score}}</td>
          <td class="align-middle">Lvl. {{user.level}}</td>
        </tr>

        <tr v-for="friend in friends" :key="friend.id">
          <th scope="row" class="text-center">
            <img
              v-bind:src="require('../img/profile_'+[friend.user_name]+'.png')"
              alt="Profile"
              class="img-friend-table rounded-circle"
            />
          </th>
          <td class="text-left align-middle">{{friend.user_name}}</td>
          <td class="align-middle">{{friend.total_score}}</td>
          <td class="align-middle">Lvl. {{friend.level}}</td>
        </tr>
      </tbody>
    </table>
    <div class="text-center">
      <button
        type="button"
        class="btn btn-dark mb-2"
        data-toggle="modal"
        data-target="#ModalChallengeAFriend"
      >Challenge a friend</button>
    </div>
  </div>
</template>

<script>
export default {
  props: ["user", "friends"],
  data() {
    return {};
  }
};
</script>

<style scoped>
.img-score {
  height: 150px;
  width: 150px;
}

.img-friend-table {
  height: 40px;
  width: 40px;
}

.img-awards-profile {
  height: 25px;
  width: 25px;
}
</style>