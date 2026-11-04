## Conteúdos Extras
 
| Utilizarei este arquivo markdown para anotar algumas informações importantes.

### Tema 01 - GitHub
#### -------------------------------------
#### Removendo um Arquivo

!! Antes de tudo, temos que conferior em qual diretório estamos e em qual está o arquivo.
- Comandos:     
  -  **dir** ou **ls** -> lista o diretório atual;
  - Comando **cd** -> utilizamos para entrar na pasta desejada 
    - (ex: cd \src\fase0_fundamentos)

#### Após verificar o diretório, podemos localizar o arquivo e apaga-lo:

- **git rm** -> é o comando que utilizaremos para apagar o arquivo da nossa máquina local 
  - (ex: git rm Semana01_01.java) -> este comando irá apagar o arquivo Semana01_01.java
- Agora, iremos commitar a alteração 
  - (ex: git commit -m "Remove exercicio)
- E dar push, para enviar ao repositório nossas modificações 
  - (ex: git push origin main)