<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    {{--  BOOTSTRAP  --}}
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title> Calculadora MVC </title>
</head>
<body>

    <header class="border-bottom mb-5" style="text-align: center;">
        <h1 class="h1"> Calculadora MVC </h1>
    </header>

    <div class="container">
        <form action="/" method="POST">
            @csrf
            <div class="card">
                <div class="card-body">
                    <div class="mb-3">
                        <input type="text" class="form-control" name="num1" placeholder="Valor 1">
                    </div>

                    <div class="mb-3">
                        <input type="text" class="form-control" name="num2" placeholder="Valor 2">
                    </div>
                    <div class="mb-3">
                        <select class="form-select" name="operacao">
                            <option value="soma">Soma</option>
                            <option value="subtracao">Subtração</option>
                            <option value="multiplicacao">Multiplicação</option>
                            <option value="divisao">Divisão</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <button type="submit" class="btn btn-primary">Calcular</button>
                    </div>
                </div>
            </div>
        </form>

        <div class="card mt-4 shadow">
            <div class="card-body">
              <span> Resultado: {{ $resultado }} </span>
            </div>
        </div>

    </div>
</body>
</html>
