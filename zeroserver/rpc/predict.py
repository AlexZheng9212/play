class PredictPRC(object):
 def predict(self, stockId):
    return "predicting ... %s" % stockId


s = zerorpc.Server(rpc.predict.PredictPRC())
