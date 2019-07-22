var zerorpc = require("zerorpc");

var client = new zerorpc.Client();
client.connect("tcp://127.0.0.1:4242");

client.on("error", function(error) {
    console.error("RPC client error:", error);
});
client.invoke("predict", "RPC", (error, res, more) => {
  if(error) {
    console.log(error)
  }
  console.log(res)
})

client.invoke("hello", "RPC", (error, res, more) => {
  if(error) {
    console.log(error)
  }
  console.log(res)
})