import zerorpc
import rpc.predict

class HelloRPC(object):
    def hello(self, name):
        return "Hello, %s" % name


if __name__ == '__main__':
s = zerorpc.Server(HelloRPC())

s.bind("tcp://0.0.0.0:4242")
s.run()