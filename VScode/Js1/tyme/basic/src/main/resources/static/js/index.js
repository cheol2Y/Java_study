const sendByApi = (method, url, params, success_callback, failure_callback) => {
  let content_type = "application/json";
  let send_url = "http://localhost:8080" + url;
  let options = {
    method: method,
    headers: {
      "Content-Type": content_type,
    },
  };

  if (method === "get") {
    send_url += "?" + new URLSearchParams(params);
  } else {
    options["body"] = JSON.stringify(params);
  }

  fetch(send_url, options).then((response) => {
    response
      .json()
      // API 호출 성공 (서버 호출 성공)
      .then((json) => {
        // 요청 결과 성공
        if (response.status >= 200 && response.status < 300) {
          // 200 ~ 299
          if (success_callback) {
            alert("요청 결과 성공");
            success_callback(json);
          }
        }
        // 요청 결과 오류
        else {
          if (failure_callback) {
            alert("요청 결과 오류");
            failure_callback(json);
          } else {
            alert(JSON.stringify(json));
          }
        }
      })
      // API 호출 오류 (서버 호출 오류)
      .catch((error) => {
        alert("API 호출 오류 (서버 호출 오류)");
        alert(JSON.stringify(error));
      });
  });
};

const springEl = document.getElementById("spring");
const pythonEl = document.getElementById("python");

const successFnc = (json) => {
  springEl.innerHTML = json["msg"];
};

const failureFnc = (json) => {
  alert(JSON.stringify(json));
};

async function mainApi() {
  try {
    await sendByApi("get", "/api/index", {}, successFnc, failureFnc);
  } catch (e) {
    console.log(e);
  }
}

// mainApi();

const api_info = {
  java: "http://localhost:8080",
  python: "",
};

let sendApi = document.getElementById("sendApi");

sendApi.onsubmit = () => {
  let server = sendApi.server.value;
  let path = sendApi.path.value;
  let number = sendApi.number.value;

  if(typeof number != 'number'){
    alert("숫자만 입력하라구");
  }
};
