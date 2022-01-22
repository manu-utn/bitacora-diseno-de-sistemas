PACKAGE = app
MAIN_CLASS = Main
MIGRATION_CLASS = Migration
#MAVEN_CMD=mvn exec:java

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

.PHONY: migration
migration:
	@echo "MAVEN: Ejecutando Migración.."
	@mvn exec:java -Dexec.mainClass="$(PACKAGE).$(MIGRATION_CLASS)"
