call mvn test -D browser=edge -D cucumber.filter.tags=@DB
call mvn test -D browser=chrome -D cucumber.filter.tags=@DB
call mvn test -D browser=firefox -D cucumber.filter.tags=@DB