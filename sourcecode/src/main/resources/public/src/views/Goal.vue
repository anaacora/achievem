<template>
  <div class="goal">
    <div class="container-fluid">
      <div class="row">
        <div class="col">
          <h3 class="mb-3">New goal</h3>
        </div>
        <div class="flex-row-reverse mr-3">
          <!-- Button trigger modal -->
          <button
            type="submit"
            class="btn btn-dark"
            data-toggle="modal"
            data-target="#templateModal"
          >Use a Template</button>
        </div>
      </div>
      <!-- Modal -->
      <div
        class="modal fade"
        id="templateModal"
        tabindex="-1"
        role="dialog"
        aria-labelledby="templateModalLabel"
        aria-hidden="true"
      >
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="templateModalLabel">Choose your Template</h5>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <div class="row mb-3">
                <div class="col">
                  <ul class="list-group">
                    <p>Used recently...</p>
                    <li
                      class="list-group-item list-group-item-action list-group-item-light"
                      data-dismiss="modal"
                    >
                      <div class="d-flex justify-content-between align-items-center">
                        <span>Drink 2l water</span>
                        <span class="txt-custom-blue-50">Health & Food</span>
                      </div>
                    </li>
                    <li
                      class="list-group-item list-group-item-action list-group-item-light"
                      data-dismiss="modal"
                    >
                      <div class="d-flex justify-content-between align-items-center">
                        <span>Eat a fruit</span>
                        <span class="txt-custom-blue-50">Health & Food</span>
                      </div>
                    </li>
                    <li
                      class="list-group-item list-group-item-action list-group-item-light"
                      data-dismiss="modal"
                    >
                      <div class="d-flex justify-content-between align-items-center">
                        <span>Read 20 book pages</span>
                        <span class="txt-custom-purple-50">Education</span>
                      </div>
                    </li>
                    <li
                      class="list-group-item list-group-item-action list-group-item-light goal_done"
                      data-dismiss="modal"
                    >
                      <div class="d-flex justify-content-between align-items-center">
                        <span>Go to the gym</span>
                        <span class="txt-custom-orange-50">Sports</span>
                      </div>
                    </li>
                    <p class="mt-3">Other templates...</p>
                    <li
                      class="list-group-item list-group-item-action list-group-item-light"
                      data-dismiss="modal"
                    >
                      <div class="d-flex justify-content-between align-items-center">
                        <span>Smoke only 1 cigarette a day</span>
                        <span class="txt-custom-green-50">Lifestyle</span>
                      </div>
                    </li>
                    <li
                      class="list-group-item list-group-item-action list-group-item-light"
                      data-dismiss="modal"
                    >
                      <div class="d-flex justify-content-between align-items-center">
                        <span>Take a break from electronics</span>
                        <span class="txt-custom-green-50">Lifestyle</span>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
            </div>
          </div>
        </div>
      </div>

      <!-- Form -->
      <form class="needs-validation" novalidate>
        <div class="form-row">
          <div class="col-6 mb-3">
            <label for="nameInput">Name</label>
            <input
              type="text"
              class="form-control"
              id="nameInput"
              placeholder="I want to sleep more!"
              v-model="goal.name"
            />
            <small
              id="nameHelpBlock"
              class="form-text text-muted"
            >Leave it empty and we'll generate it for you! :)</small>
          </div>
          <div class="col-6 mb-4">
            <label for="categoriesSelect">Category</label>
            <select
              class="custom-select"
              id="categoriesSelect"
              required
              v-model="goal.category"
              v-bind:class="{ 'is-invalid': !validation.category}"
            >
              <option selected disabled value>Choose a category</option>
              <option class="txt-custom-purple-50">Education</option>
              <option class="txt-custom-blue-50">Health & Food</option>
              <option class="txt-custom-green-50">Lifestyle</option>
              <option class="txt-custom-orange-50">Sports</option>
            </select>
          </div>
        </div>
        <div class="form-row">
          <div class="col-6 mb-4">
            <label for="targetInput">Target</label>
            <input
              type="number"
              class="form-control"
              id="targetInput"
              placeholder="0"
              required
              v-model="goal.target"
              v-bind:class="{ 'is-invalid': !validation.target}"
            />
          </div>
          <div class="col-6 mb-4">
            <label for="unitSelect">Unit</label>
            <select
              class="custom-select"
              id="unitSelect"
              required
              v-model="goal.unit"
              v-bind:class="{ 'is-invalid': !validation.unit}"
            >
              <option selected disabled value>Choose unit</option>
              <option>cm - Centimeters</option>
              <option>g - Grams</option>
              <option>h - Hours</option>
              <option>l - Litres</option>
              <option>p - pages</option>
              <option>x - times</option>
              <option>Other</option>
            </select>
          </div>
        </div>
        <div class="form-row">
          <div class="col-6 mb-3">
            <label for="startDateInput">Start Date</label>
            <div class="input-group">
              <div class="input-group-prepend">
                <span class="input-group-text" id="startDateInputPrepend">
                  <span class="fas fa-calendar-alt"></span>
                </span>
              </div>
              <input
                type="text"
                class="form-control"
                id="startDateInput"
                aria-describedby="startDateInputPrepend"
                required
                v-model="goal.startDate"
                v-bind:class="{ 'is-invalid': !validation.startDate}"
              />
            </div>
            <small
              id="startDateHelpBlock"
              v-bind:class="{ 'text-muted': validation.formatStartDate, 'text-danger': !validation.formatStartDate}"
            >Format: DD.MM.YYYY (0 do not need to be written e.g. 1.1.2020)</small>
          </div>
          <div class="col-6 mb-3">
            <label for="endDateInput">End Date</label>
            <div class="input-group">
              <div class="input-group-prepend">
                <span class="input-group-text" id="endDateInputPrepend">
                  <span class="fas fa-calendar-alt"></span>
                </span>
              </div>
              <input
                type="text"
                class="form-control"
                id="endDateInput"
                aria-describedby="endDateInputPrepend"
                v-model="goal.endDate"
                v-bind:class="{ 'is-invalid': !validation.endDate}"
              />
            </div>
            <small
              id="endDateHelpBlock"
              v-bind:class="{ 'text-muted': validation.formatEndDate, 'text-danger': !validation.formatEndDate}"
            >Format: DD.MM.YYYY (0 do not need to be written e.g. 1.1.2020)</small>
          </div>
        </div>
        <div class="form-row">
          <div class="col mb-4">
            <label for="repSelect">Repetition</label>
            <select
              class="custom-select"
              id="repSelect"
              v-model="goal.repetition"
              v-bind:class="{ 'is-invalid': !validation.repetition}"
            >
              <option selected disabled value>Choose repetition</option>
              <option>Daily</option>
              <option>Weekly</option>
              <option>Twice a week</option>
              <option>Monthly</option>
              <option>Twice a month</option>
              <option>Custom</option>
            </select>
          </div>
        </div>
        <div class="form-group">
          <div class="form-check">
            <input class="form-check-input" type="checkbox" value id="templateCheck" />
            <label class="form-check-label" for="templateCheck">Save as template</label>
          </div>
          <small
            id="templateCheckHelpBlock"
            class="form-text text-muted"
          >If checked, you'll be able to use this template for another goal.</small>
        </div>
        <button v-on:click="addGoal" type="submit" class="btn btn-dark">Create</button>
        <router-link class="btn btn-secondary ml-3" to="/">Cancel</router-link>
      </form>
    </div>
  </div>
</template>
<script>
import { url } from "../assets/global.js";
import axios from "axios";

export default {
  name: "Goal",
  data: function() {
    return {
      goal: {
        name: "",
        modal: "",
        category: "",
        target: "",
        progress: "0",
        unit: "",
        startDate: "",
        endDate: "",
        repetition: "",
        progressData: [0, 0, 0, 0, 0, 0, 0]
      },
      validation: {
        category: true,
        target: true,
        unit: true,
        repetition: true,
        startDate: true,
        endDate: true,
        formatStartDate: true,
        formatEndDate: true
      },
      isValid: false
    };
  },
  methods: {
    addGoal() {
      this.validateForm();
      if (this.isValid) {
        //set name if empty
        if (this.goal.name === "") {
          this.goal.name =
            "Do something " +
            this.goal.target +
            " " +
            this.goal.unit +
            " " +
            this.goal.repetition;
        }
        //format start date to sql date format
        const startDate = this.goal.startDate.split(".");
        const formatedStartDate =
          startDate[2] + "-" + startDate[1] + "-" + startDate[1];
        this.goal.startDate = formatedStartDate;

        //format end date to sql date format
        const endDate = this.goal.endDate.split(".");
        const formatedEndDate =
          endDate[2] + "-" + endDate[1] + "-" + endDate[1];
        this.goal.endDate = formatedEndDate;

        this.setModalName();
        this.postGoal();
      }
    },

    setModalName() {
      let goalName = this.goal.name;
      goalName = goalName.replace(/ /g, "");
      this.goal.modal = goalName + "Modal";
    },

    validateForm() {
      //set valid
      this.isValid = true;
      this.validation.category = true;
      this.validation.target = true;
      this.validation.unit = true;
      this.validation.repetition = true;
      this.validation.startDate = true;
      this.validation.endDate = true;
      this.validation.repetition = true;

      //check if not valid
      if (this.goal.category === "") {
        this.validation.category = false;
        this.isValid = false;
      }
      if (this.goal.target === "") {
        this.validation.target = false;
        this.isValid = false;
      }
      if (this.goal.unit === "") {
        this.validation.unit = false;
        this.isValid = false;
      }
      if (this.goal.repetition === "") {
        this.validation.repetition = false;
        this.isValid = false;
      }
      const dateRegex = /[0-9]{1,2}\.[0-9]{1,2}\.[2]{1}[0-9]{3}/;
      if (this.goal.startDate === "") {
        this.validation.startDate = false;
        this.isValid = false;
      } else if (!dateRegex.test(this.goal.startDate)) {
        this.validation.startDate = false;
        this.validation.formatStartDate = false;
        this.isValid = false;
      }
      if (this.goal.endDate === "") {
        this.validation.endDate = false;
        this.isValid = false;
      } else if (!dateRegex.test(this.goal.endDate)) {
        this.validation.endDate = false;
        this.validation.formatEndDate = false;
        this.isValid = false;
      }
    },

    postGoal() {
      axios
        .post(url + "/goals", JSON.stringify(this.goal))
        .then(response => {
          alert(response.data);
          this.$router.replace("/");
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
};
</script>
