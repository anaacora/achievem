var ctx = document.getElementById("statisticChart");
var statisticChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
        datasets: [{
            label: '# of Episodes',
            yAxisID: 'A',
            data: [75, 150, 80, 120, 70, 100, 20],
            backgroundColor: 'rgba(130, 183, 227, 1)',
            borderColor: 'rgba(46, 136, 209, 1)',
            borderWidth: 1
        }]
    },
    options: {
        tooltips: { enabled: false },
        legend: {
            display: false
        },
        responsive: false,
        scales: {
            yAxes: [{
                id: 'A',
                ticks: {
                    stepSize: 50,
                    beginAtZero: true
                }
            }]
        }
    }
});

//call initChart when page gets called
function initChart() {
    //calculate time and set labels 
    //statisticChart.data.labels = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

    //set data to first activ goal
}

//updates the chart
function updateChart(data) {

    //get new data as param probably

    // add label
    //statisticChart.data.labels.push(name);
    // add nr of episodes
    //statisticChart.data.datasets[0].data.push(nrOfEpisodes);

    //add colorcodes as attribute to categories in DB -> easier
    var categories = ["blue", "purple", "orange", "green"];
    var category = categories[0];

    //COLORS USED: always 50 % & 70 %

    if (category === "blue") {
        //IF Blue - Health & Food: 
        statisticChart.data.datasets[0].borderColor = 'rgba(46, 136, 209, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(130, 183, 227, 1)';
    } else if (category === "purple") {
        //IF Purple - Education: 
        statisticChart.data.datasets[0].borderColor = 'rgba(173, 82, 132, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(206, 151, 181, 1)';
    } else if (category === "orange") {
        //IF Orange - Sports: 
        statisticChart.data.datasets[0].borderColor = 'rgba(209, 112, 46, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(227, 169, 130, 1)';
    } else if (category === "green") {
        //IF Green - Lifestyle: 
        statisticChart.data.datasets[0].borderColor = 'rgba(71, 184, 116, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(145, 212, 172, 1)';
    }

    // update the chart
    statisticChart.update();
}