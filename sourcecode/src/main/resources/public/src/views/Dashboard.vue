<template>
  <div class="dashboard">
    <div class="container-fluid">
      <div class="row mb-3">
        <div class="col">
          <h3>Today</h3>
        </div>
        <div class="col muted d-flex justify-content-end pt-2">
          <div>
            <i class="fas fa-chevron-left hovering mr-1"></i>
            <p class="no-space hovering">
              <span>07.03</span>
            </p>
            <i class="fas fa-chevron-right hovering ml-1"></i>
            <i class="fas fa-calendar hovering ml-1"></i>
            <i class="fas fa-chevron-down hovering ml-4"></i>
          </div>
        </div>
      </div>

      <div class="row mb-3">
        <div class="col">
          <ul class="list-group">
            <li
              class="list-group-item list-group-item-action list-group-item-light"
              data-toggle="modal"
              data-target="#ModalWater"
            >
              <div class="d-flex justify-content-between">
                <div class="col-4 p-0">
                  <span>Drink 2l water</span>
                </div>
                <div class="col-4 text-center p-0">
                  <span class="txt-custom-blue-50">Health & Food</span>
                </div>
                <div class="col-4 text-right p-0">
                  <span class="badge bg-custom-blue-50 badge-pill">0.5l / 2l</span>
                </div>
              </div>
              <div class="progress">
                <div
                  class="progress-bar bg-custom-blue-50"
                  role="progressbar"
                  style="width: 25%"
                  aria-valuenow="25"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
                <div
                  class="progress-bar bg-custom-blue-70"
                  role="progressbar"
                  style="width: 75%"
                  aria-valuenow="75"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
            </li>
            <li
              class="list-group-item list-group-item-action list-group-item-light"
              data-toggle="modal"
              data-target="#ModalFruit"
            >
              <div class="d-flex justify-content-between">
                <div class="col-4 p-0">
                  <span>Eat 3 fruits</span>
                </div>
                <div class="col-4 text-center p-0">
                  <span class="txt-custom-blue-50">Health & Food</span>
                </div>
                <div class="col-4 text-right p-0">
                  <span class="badge bg-custom-blue-50 badge-pill">0 / 3 fruits</span>
                </div>
              </div>
              <div class="progress">
                <div
                  class="progress-bar bg-custom-blue-50"
                  role="progressbar"
                  style="width: 0%"
                  aria-valuenow="0"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
                <div
                  class="progress-bar bg-custom-blue-70"
                  role="progressbar"
                  style="width: 100%"
                  aria-valuenow="100"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
            </li>
            <li
              class="list-group-item list-group-item-action list-group-item-light"
              data-toggle="modal"
              data-target="#ModalPages"
            >
              <div class="d-flex justify-content-between">
                <div class="col-4 p-0">
                  <span>Read 20 book pages</span>
                </div>
                <div class="col-4 text-center p-0">
                  <span class="txt-custom-purple-50">Education</span>
                </div>
                <div class="col-4 text-right p-0">
                  <span class="badge bg-custom-purple-50 badge-pill">15 / 20 pages</span>
                </div>
              </div>
              <div class="progress">
                <div
                  class="progress-bar bg-custom-purple-50"
                  role="progressbar"
                  style="width: 75%"
                  aria-valuenow="75"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
                <div
                  class="progress-bar bg-custom-purple-70"
                  role="progressbar"
                  style="width: 25%"
                  aria-valuenow="25"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
            </li>
            <li
              class="list-group-item list-group-item-action list-group-item-light"
              data-toggle="modal"
              data-target="#ModalGym"
            >
              <div class="d-flex justify-content-between">
                <div class="col-4 p-0">
                  <span>Go to the gym</span>
                </div>
                <div class="col-4 text-center p-0">
                  <span class="txt-custom-orange-50">Sports</span>
                </div>
                <div class="col-4 text-right p-0">
                  <span class="badge bg-custom-orange-50 badge-pill">DONE</span>
                </div>
              </div>
              <div class="progress">
                <div
                  class="progress-bar bg-custom-orange-50"
                  role="progressbar"
                  style="width: 100%"
                  aria-valuenow="0"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
                <div
                  class="progress-bar bg-custom-orange-70"
                  role="progressbar"
                  style="width: 0%"
                  aria-valuenow="100"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>

    <statistics></statistics>

    <!-- Modals -->
    <div
      class="modal fade"
      id="ModalWater"
      tabindex="-1"
      role="dialog"
      aria-labelledby="MLabelWater"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5
              class="modal-title txt-custom-blue-50"
              id="MLabelWater"
            >Health & Food: Drink 2l water</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div class="row">
              <div class="col">
                <div class="form-group">
                  <label for="counterInput">Add progress to your goal!</label>
                  <div class="input-group">
                    <input
                      type="number"
                      step="0.5"
                      class="form-control"
                      id="counterInput"
                      value="1"
                      aria-label="counterLabelAppend"
                      aria-describedby="counter"
                    />
                    <div class="input-group-append">
                      <span
                        class="input-group-text text-white bg-custom-blue-70"
                        id="counterLabelAppend"
                      >l water</span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn text-white bg-custom-blue-50 toast-health-show"
              data-dismiss="modal"
            >Add</button>
            <button
              type="button"
              class="btn text-white bg-custom-blue-70"
              data-dismiss="modal"
            >Close</button>
          </div>
        </div>
      </div>
    </div>

    <div
      class="modal fade"
      id="ModalFruit"
      tabindex="-1"
      role="dialog"
      aria-labelledby="MLabelFruit"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title txt-custom-blue-50" id="MLabelFruit">Health & Food: Eat 3 fruits</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div class="row">
              <div class="col">
                <div class="form-group">
                  <label for="counterInput">Add progress to your goal!</label>
                  <div class="input-group">
                    <input
                      type="number"
                      class="form-control"
                      id="counterInput"
                      value="1"
                      aria-label="counterLabelAppend"
                      aria-describedby="counter"
                    />
                    <div class="input-group-append">
                      <span
                        class="input-group-text text-white bg-custom-blue-70"
                        id="counterLabelAppend"
                      >fruits</span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn text-white bg-custom-blue-50 toast-health-show"
              data-dismiss="modal"
            >Add</button>
            <button
              type="button"
              class="btn text-white bg-custom-blue-70"
              data-dismiss="modal"
            >Close</button>
          </div>
        </div>
      </div>
    </div>

    <div
      class="modal fade"
      id="ModalPages"
      tabindex="-1"
      role="dialog"
      aria-labelledby="MLabelPages"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5
              class="modal-title txt-custom-purple-50"
              id="MLabelPages"
            >Education: Read 20 book pages</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div class="row">
              <div class="col">
                <div class="form-group">
                  <label for="counterInput">Add progress to your goal!</label>
                  <div class="input-group">
                    <input
                      type="number"
                      class="form-control"
                      id="counterInput"
                      value="1"
                      aria-label="counterLabelAppend"
                      aria-describedby="counter"
                    />
                    <div class="input-group-append">
                      <span
                        class="input-group-text text-white bg-custom-purple-70"
                        id="counterLabelAppend"
                      >Pages</span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn text-white bg-custom-purple-50 toast-edu-show"
              data-dismiss="modal"
            >Add</button>
            <button
              type="button"
              class="btn text-white bg-custom-purple-70"
              data-dismiss="modal"
            >Close</button>
          </div>
        </div>
      </div>
    </div>

    <!-- not shown because task already completed -->
    <!-- <div class="modal fade" id="ModalGym" tabindex="-1" role="dialog" aria-labelledby="MLabelGym" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="MLabelGym">Go to the gym</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col">
                            <div>
                                <button type="button" class="btn btn-block btn-success">Done it</button>
                            </div>
                        </div>
                        <div class="col">
                            <div>
                                <button type="button" class="btn btn-block btn-danger">Not done</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-dark toast-sport-show" data-dismiss="modal">Add</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>-->

    <!-- Toasts -->
    <div aria-live="polite" aria-atomic="true">
      <div
        id="toast-health"
        class="toast position-absolute"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
        data-delay="5000"
      >
        <div class="toast-header">
          <strong class="mr-auto">YOU ACHIEVED'EM!</strong>
          <small class="text-muted">just now</small>
          <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="toast-body">
          You achieved a goal in
          <span class="txt-custom-blue-50">Health & Food</span> !!!
          <span class="fas fa-laugh-beam"></span>
        </div>
      </div>
    </div>
    <div aria-live="polite" aria-atomic="true">
      <div
        id="toast-edu"
        class="toast position-absolute"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
        data-delay="5000"
      >
        <div class="toast-header">
          <strong class="mr-auto">YOU ACHIEVED'EM!</strong>
          <small class="text-muted">just now</small>
          <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="toast-body">
          You achieved a goal in
          <span class="txt-custom-purple-50">Education</span> !!!
          <span class="fas fa-laugh-beam"></span>
        </div>
      </div>
    </div>
    <div aria-live="polite" aria-atomic="true">
      <div
        id="toast-sport"
        class="toast position-absolute"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
        data-delay="5000"
      >
        <div class="toast-header">
          <strong class="mr-auto">YOU ACHIEVED'EM!</strong>
          <small class="text-muted">just now</small>
          <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="toast-body">
          You achieved a goal in
          <span class="txt-custom-orange-50">Sports</span> !!!
          <span class="fas fa-laugh-beam"></span>
        </div>
      </div>
    </div>

    <!--<script src="js/statistic_chart.js"></script>-->
  </div>
</template>

<style scoped>
.no-space {
  padding: 0px;
  margin: 0px;
  display: inline;
}

.progress {
  height: 5px;
  margin-top: 5px;
}

.badge-pill {
  color: white;
}

.statistic {
  height: 350px;
  width: 450px;
}

.toast {
  background-color: rgba(255, 255, 255, 0.95);
  z-index: 999;
  right: 25%;
  top: 71px;
  /* position: absolute;
	width: 100%;
	height: 100%;
	display: none; */
}
</style>

<script>
// @ is an alias to /src
import Statistics from "@/components/Statistics.vue";

export default {
  name: "Dashboard",
  components: {
    Statistics
  }
};
</script>
