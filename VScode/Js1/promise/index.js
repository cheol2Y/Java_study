function someAsyncTask() {
  return new Promise(function (resolve, reject) {
    setTimeout(() => resolve(1), 1000); // (*)
  })
    .then(function (result) {
      // (**)

      alert(result); // 1
      return result * 2;
    })
    .then(function (result) {
      // (***)

      alert(result); // 2
      return result * 2;
    })
    .then(function (result) {
      alert(result); // 4
      return result * 2;
    });
}

async function main() {
  try {
    const result = await someAsyncTask();
    console.log(result);
  } catch (error) {
    console.log(error);
  }
}

main();
