<template>
  <div
    class="modal fade"
    id="ModalChallengeAFriend"
    tabindex="-1"
    role="dialog"
    aria-labelledby="MLabelCAF"
    aria-hidden="true"
  >
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="MLabelCAF">Challenge a friend</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <div class="row mb-3">
            <div class="col">
              <ul class="list-group">
                <p class="mt-3">What goal do you want to challenge?</p>

                <li
                  class="list-group-item list-group-item-action"
                  v-for="(goal, index) in goals"
                  v-bind:class="{ 'list-group-item-secondary': activeGoalIndex === index }"
                  v-bind:key="goal.id"
                  @click="setActiveGoal(goal, index)"
                >
                  <div class="d-flex justify-content-between align-items-center">
                    <span>{{goal.name}}</span>
                    <span v-bind:class="[goal.text]">{{goal.category}}</span>
                  </div>
                </li>

                <p class="mt-3">Who do you want to challenge?</p>

                <li
                  class="list-group-item list-group-item-action"
                  v-for="(friend, index) in friends"
                  v-bind:class="{ 'list-group-item-secondary': activeFriendIndex === index }"
                  v-bind:key="friend.id"
                  @click="setActiveFriend(friend, index)"
                >
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="col p-0 text-left">
                      <img
                        v-bind:src="require('../img/profile_'+[friend.user_name]+'.png')"
                        alt="Profile"
                        class="img-awards-profile rounded-circle"
                      />
                      <span>{{friend.user_name}}</span>
                    </div>
                    <div class="col p-0 text-right">
                      <span>{{friend.total_score}}</span>
                    </div>
                    <div class="col p-0 text-right">
                      <span>Lvl. {{friend.level}}</span>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Challenge!</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["goals", "friends"],
  data() {
    return {
      activeGoalIndex: undefined,
      activeFriendIndex: undefined
    };
  },
  methods: {
    setActiveGoal(goal, index) {
      this.activeGoalIndex = index;
    },
    setActiveFriend(friend, index) {
      this.activeFriendIndex = index;
    }
  }
};
</script>

<style scoped>
.img-awards-profile {
  height: 25px;
  width: 25px;
}

.img-awards {
  height: 75px;
  width: 75px;
}
</style>