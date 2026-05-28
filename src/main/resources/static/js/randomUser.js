function displayUser(user) {
    console.log(user);
    document.getElementById("userImage").src = user.img;
    document.getElementById("userGender").innerHTML = user.gender;
    document.getElementById("userName").innerHTML = user.name;
}

function GetAndDisplayNextUser() {
    const url = " https://randomuser.me/api";
    fetch(url) 
    .then(function(res) {
       return res.json();
    }).then(function(data) {
        var userData = data.results[0];
        var myUser = {};
        myUser.name = userData.name.title + " " + userData.name.first + " " + userData.name.last;
        myUser.gender = userData.gender;
        myUser.img = userData.picture.large;
        displayUser(myUser);
    }).catch(function(err) {
        console.log("ERROR : ",err);
    })
}
async function DisplayandGetRandomUSer() {
    const url = " https://randomuser.me/api";
    var response = await fetch(url);
    var data = await response.json();
    var userData = data.results[0];
    var myUser = {};
    myUser.name = userData.name.title + " " + userData.name.first + " " + userData.name.last;
    myUser.gender = userData.gender;
    myUser.img = userData.picture.large;
    displayUser(myUser);
}