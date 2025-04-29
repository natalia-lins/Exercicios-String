<h1>Exercícios String - 1° DSM 2025</h1>
<p>Resolução dos exercícios de String na aula de "Algoritmos e Lógica de Programação" ministrada pela Prof. Sirley.</p>

<h2>📝 Descrição dos exercícios</h2>
<ul>
  <li> <strong>Atividade 1: </strong> Crie um programa que receba uma string do usuário e exiba:
<br> a) Quantidade de caracteres
<br> b) A string em letras maiúsculas
<br> c) Quantidade de vogais
<br> d) Quantidade de dígitos numéricos </li>
  <br>
  <li> <strong>Atividade 2: </strong> Crie um programa que receba um número inteiro do usuário e exiba cada dígito por extenso.
<br> Exemplo: 4571 → quatro, cinco, sete, um</li>
  <br>
  <li> <strong>Atividade 3: </strong> Crie um programa que receba um nome completo do usuário e exiba suas iniciais em maiúsculas, ignorando conectores como de, da, do, dos, das, di, du, e.
<br> Exemplo: João Carlos dos Santos → JCS </li>
  <br>
  <li> <strong>Atividade 4: </strong>Crie um programa que receba um texto e exiba a quantidade total de caracteres e de palavras (Palavras são separadas por espaços em branco).
  <br> Exemplo: "Estou aprendendo Java" → Caracteres: 23 Palavras: 3 </li>
  <br>
  <li> <strong>Atividade 5: </strong> Crie um programa que receba um texto e remova os espaços em branco extras, deixando apenas um espaço entre as palavras.
  <br> Exemplo: "Estou &nbsp&nbsp&nbspAprendendo &nbsp&nbspJava" → "Estou aprendendo Java"</li>
  <br>
  <li><strong>Atividade 6: </strong> Crie um programa em Java que simule um algoritmo genético com:
<br> - Recombinação: recebe duas strings (S1 e S2) de mesmo tamanho, sorteia um ponto de corte e gera dois filhos (S3 e S4) trocando partes das strings.
<br> - Mutação: altera aleatoriamente um caractere em um dos filhos. 
<br> O programa deve: 
    <br> - Ler S1 e S2; 
    <br> - Realizar a recombinação e gerar S3 e S4; 
    <br> - Aplicar mutação em S3 ou S4; 
    <br> - Exibir os quatro indivíduos (S1, S2, S3, S4).
</li>
</ul>
  
<h2>⛏️ Métodos utilizados na resolução da lista</h2>
  
  <table>
    <tr>
      <th>Método</th>
      <th>Descrição</th>
      <th>Exemplo</th>
    </tr>
    <tr>
      <td><code>.toLowerCase()</code></td>
      <td>Converte todos os caracteres da string para minúsculas.</td>
      <td><code>"JAVA".toLowerCase()</code> → <code>"java"</code></td>
    </tr>
    <tr>
      <td><code>.toUpperCase()</code></td>
      <td>Converte todos os caracteres da string para maiúsculas.</td>
      <td><code>"java".toUpperCase()</code> → <code>"JAVA"</code></td>
    </tr>
    <tr>
      <td><code>.toCharArray()</code></td>
      <td>Converte a string em um array de caracteres.</td>
      <td><code>"java".toCharArray()</code> → <code>{'j', 'a', 'v', 'a'}</code></td>
    </tr>
    <tr>
      <td><code>.length()</code></td>
      <td>Retorna o número de caracteres na string.</td>
      <td><code>"java".length()</code> → <code>4</code></td>
    </tr>
    <tr>
      <td><code>Integer.toString(x)</code></td>
      <td>Converte um número inteiro em uma string.</td>
      <td><code>Integer.toString(123)</code> → <code>"123"</code></td>
    </tr>
    <tr>
      <td><code>.split()</code></td>
      <td>Divide a string com base em um delimitador e retorna um array.</td>
      <td><code>"a,b,c".split(",")</code> → <code>{"a", "b", "c"}</code></td>
    </tr>
    <tr>
      <td><code>.charAt(0)</code></td>
      <td>Retorna o caractere na posição indicada (0 = primeira letra).</td>
      <td><code>"java".charAt(0)</code> → <code>'j'</code></td>
    </tr>
    <tr>
      <td><code>.equalsIgnoreCase()</code></td>
      <td>Compara duas strings ignorando diferenças entre maiúsculas/minúsculas.</td>
      <td><code>"java".equalsIgnoreCase("JAVA")</code> → <code>true</code></td>
    </tr>
    <tr>
      <td><code>.trim()</code></td>
      <td>Remove espaços em branco do início e fim da string.</td>
      <td><code>" java ".trim()</code> → <code>"java"</code></td>
    </tr>
    <tr>
      <td><code>.replaceAll()</code></td>
      <td>Substitui todas as ocorrências de uma expressão regular por outra string.</td>
      <td><code>"123-456".replaceAll("-", "")</code> → <code>"123456"</code></td>
    </tr>
    <tr>
      <td><code>.substring()</code></td>
      <td>Extrai uma parte da string entre dois índices.</td>
      <td><code>"java".substring(1, 3)</code> → <code>"av"</code></td>
    </tr>
    <tr>
      <td><code>.setCharAt</code></td>
      <td>Altera um caractere em uma posição específica de um <code>StringBuilder</code>.</td>
      <td>
        <code>
          StringBuilder sb = new StringBuilder("java");<br>
          sb.setCharAt(0, 'J');
        </code> → <code>"Java"</code>
      </td>
    </tr>
  </table>
