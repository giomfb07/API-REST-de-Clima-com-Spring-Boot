## API Clima - Belo Horizonte

**Alunas: Giovanna Marques e Gabriela Pinheiro**

API REST desenvolvida com Java + Spring Boot para consultar informações meteorológicas de Belo Horizonte - MG, utilizando a Open-Meteo.

### **Tecnologias**
 - Java 
 - Spring Boot
 - RestTemplate
 - Maven
 - Open-Meteo

### **Execução**
Pré-requisitos: Java e Maven instalados.
Execute:

```bash
    mvn clean install
    mvn spring-boot:run
```

A aplicação estará disponível em:
```bash
    http://localhost:8080
```

### **Endpoint**

GET /clima
```bash
http://localhost:8080/clima
```

Retorna dados como:
 - Temperatura atual
 - Umidade
 - Velocidade e direção do vento
 - Temperatura máxima e mínima
 - Condição meteorológica
 
### **API utilizada**
```bash
Open-Meteo:
https://api.open-meteo.com/v1/forecast
```
**Não é necessária API Key.**

### **Funcionamento**
- GET /clima
   ↓
- Controller
   ↓
- Service
   ↓
- RestTemplate
   ↓
- Open-Meteo
   ↓
- JSON

