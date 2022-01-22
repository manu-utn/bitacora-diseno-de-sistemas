PACKAGE = pokemon
MAIN_CLASS = Server

.PHONY: all
all: build run

.PHONY: build
build:
	@echo "MAVEN: Compilando proyecto.."
	@mvn package

.PHONY: run
run:
	@echo "MAVEN: Ejecutando Main.."
	@mvn exec:java -Dexec.mainClass="$(PACKAGE).$(MAIN_CLASS)"
