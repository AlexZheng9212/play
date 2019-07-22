from jsonrpcserver import method, dispatch, serve

@method
def ping():
    return 'pssps'


if __name__ == '__main__':
    print(12)
    serve()
    response = dispatch('{"jsonrpc": "2.0", "method": "ping", "id":11023}')
    print(123)
    print(response.http_status)
