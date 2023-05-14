@echo off
cd sql\20190527_data
for %%G in (*.sql) do (
  echo Importing file: %%G
  mysql -u root -p010514 bedroom < %%G
)
pause