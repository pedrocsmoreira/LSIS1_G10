function login(){
    let form = document.getElementById("Login");
    let formdata = new FormData(form);

    fetch("/submitlogin", {
        method: "POST",
        body: formdata,
    })
        .then((res) => {
            if (res.status === 200) {
                window.location.assign("/paginaEquipa.html");
                return res.json();
            } else if (res.status === 201) {
                window.location.assign("/paginaJuri.html");
                return res.json();
            } else if (res.status === 202) {
                window.location.assign("/paginaOrganizador.html");
                return res.json();
            } else {
                throw Error("Erro no servidor!!");
            }
        })
        .catch((err) => console.log(err));
}