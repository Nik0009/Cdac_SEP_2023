const rwModule=require("./readWriteModule");
const dModule=require("./dataModule");

const data=dModule.getData()

rwModule.writeData(data)
rwModule.readData()