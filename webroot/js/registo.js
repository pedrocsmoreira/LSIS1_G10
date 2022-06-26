function registarEquipa(){

    let form = document.getElementById("registarEquipa");
    let formdata = new FormData(form);

    fetch("/submitEquipa", {
        method: "POST",
        body: formdata,
    })
        .then((res) => {
            if (res.status === 200) {
                window.location.assign("index.html");
                return res.json();

            } else {
                throw Error("Erro no servidor!!");
            }
        })
        .catch((err) => console.log(err));
}

function registarJuri(){
    let form = document.getElementById("registarJuri");
    let formdata = new FormData(form);

    fetch("/submitJuri", {
        method: "POST",
        body: formdata,
    })
        .then((res) => {
            if (res.status === 200) {
                window.location.assign("index.html");
                return res.json();

            } else {
                throw Error("Erro no servidor!!");
            }
        })
        .catch((err) => console.log(err));

}

function registarOrganizador(){
    let form = document.getElementById("registarOrganizador");
    let formdata = new FormData(form);

    fetch("/submitOrganizador", {
        method: "POST",
        body: formdata,
    })
        .then((res) => {
            if (res.status === 200) {
                window.location.assign("index.html");
                return res.json();

            } else {
                throw Error("Erro no servidor!!");
            }
        })
        .catch((err) => console.log(err));
}