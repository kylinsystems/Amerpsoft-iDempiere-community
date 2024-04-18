&lArr;[COMMUNITY PLUGINS](../README.md) | [Home](../README.md)
# <b>Languages</b>

## <b>Installation </b>

Follow these steps in order to define a new System Language in your Idempiere System.
Language table contains most of Languages and Localizations. For example for Spanish there are different Localization for the different countries.
We have:

```text
- es_ES for Spain.
- es_VE for venezuela
- es_PY for Paraguay
..
- es_CL for Chile
```
In the default database provided for Idempiere we only have <b>en_US</b> and <b>es_CO</b> as System Languages.
System Languages provides possibility to translate Elements, Fields, Tables, Messages and all different entities in Didempiere.
In Spanish Localizations, we have basically the same structure, but we could identify only small differences. 

For these reasons, i have done a Script to copy (clone) from es_CO provided from Seed, to the selected localization es_XX, and in the next future, we could make minor changes in our Application Dictionary.
	
### <b>1- Set Spanish es_XX as System language</b>
```text
- Login idempiere as System in English
- Go to Menu: /System Admin/General Rules/System Rules/Language
- On Window Language: Locate es_ES, es_VE, es_PY.  Or your preferred Language xx_XX
- On Window Language: Check System Language
- On Window Language: Execute 'Language Mantenance' Process
    ( If you are using other Locale adjust to your)
```

### <b>2- Create Language extension for es__VE or xx__XX</b>
```text
- Download Scripts from Repository (See This plugin documentation directory)
- Example:  Create-language-from-es-CO-to-es-VE.sql" Script
- Execute Query from PostgreSQL environment. (Recommended do it in partial queries)
- You may edit this Query for your favourite Language xx_XX
- Remember to do <b>Syncronize Terminology</b>
```

### <b>3- Manual changes on some Translation</b>

Manually translate the labels associated with regions, municipalities and parishes.

```text
- Goto 'Application Dictionary/Messges' and Locale for Region, Municipality and Parish.
- Change for Paraguay to Departamento/ Distrito /Barrio.
- Change for venezuela to Estado / Municipio / Parroquia.

These tags are important to change, because they are used on Entended Location Window when you select a Language different to English.
```

### <b>4-Manually Translate Language record for your es_XX</b>

Menu (System Admin/General Rules/SystemRules/Language)

```text
Modify 'Print Text' Field and Translate to yoy selected Language (Spanish for example). 
Español (Paraguay)  for es_PY
Español (Veneuela)  for es_VE
```
