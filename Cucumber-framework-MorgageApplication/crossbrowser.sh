#!/bin/sh
mvn test -D browser=edge -D cucumber.filter.tags=@login
mvn test -D browser=chrome -D cucumber.filter.tags=@login
mvn test -D browser=firefox -D cucumber.filter.tags=@login