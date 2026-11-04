# Conteúdos Extras — Git e GitHub

Este arquivo contém anotações, comandos e informações úteis sobre Git e GitHub.

---

## Removendo um arquivo do repositório

Antes de remover um arquivo, confirme se você está no diretório correto do projeto e localize o arquivo que deseja apagar.

### Verificando o diretório atual

Use um dos comandos abaixo para listar os arquivos e pastas do diretório atual:

```bash
dir
```

ou:

```bash
ls
```

Para navegar até outra pasta do projeto, use o comando `cd`.

Exemplo no Windows:

```bash
cd .\src\fase0_fundamentos
```

Exemplo no Linux ou macOS:

```bash
cd src/fase0_fundamentos
```

---

### Removendo o arquivo com Git

Use `git rm` para remover um arquivo da sua máquina local e preparar essa remoção para o próximo commit.

```bash
git rm Semana01_01.java
```

Esse comando remove o arquivo e o adiciona à área de preparação (*staging area*) do Git.

Para conferir as alterações antes de criar o commit:

```bash
git status
```

---

### Registrando a remoção

Depois de remover o arquivo, crie um commit para registrar a alteração no histórico do projeto:

```bash
git commit -m "Remove exercício Semana01_01"
```

---

### Enviando a alteração para o GitHub

Por fim, envie o commit para o repositório remoto:

```bash
git push origin main
```

> O comando acima envia as alterações para a branch `main`. Caso esteja trabalhando em outra branch, substitua `main` pelo nome correto.

---

## Comandos utilizados

| Comando | Descrição |
| --- | --- |
| `dir` ou `ls` | Lista arquivos e pastas do diretório atual. |
| `cd nome-da-pasta` | Entra em uma pasta do projeto. |
| `git status` | Mostra os arquivos modificados, removidos ou preparados para commit. |
| `git rm nome-do-arquivo` | Remove um arquivo localmente e o prepara para remoção no repositório. |
| `git commit -m "mensagem"` | Registra as alterações no histórico local do Git. |
| `git push origin main` | Envia os commits locais para a branch `main` no GitHub. |
```