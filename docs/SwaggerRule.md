

# SwaggerRule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticators** | [**List&lt;SwaggerRuleHandler&gt;**](SwaggerRuleHandler.md) | Authenticators is a list of authentication handlers that will try and authenticate the provided credentials. Authenticators are checked iteratively from index 0 to n and if the first authenticator to return a positive result will be the one used.  If you want the rule to first check a specific authenticator  before \&quot;falling back\&quot; to others, have that authenticator as the first item in the array. |  [optional]
**authorizer** | [**SwaggerRuleHandler**](SwaggerRuleHandler.md) |  |  [optional]
**description** | **String** | Description is a human readable description of this rule. |  [optional]
**id** | **String** | ID is the unique id of the rule. It can be at most 190 characters long, but the layout of the ID is up to you. You will need this ID later on to update or delete the rule. |  [optional]
**match** | [**SwaggerRuleMatch**](SwaggerRuleMatch.md) |  |  [optional]
**mutators** | [**List&lt;SwaggerRuleHandler&gt;**](SwaggerRuleHandler.md) | Mutators is a list of mutation handlers that transform the HTTP request. A common use case is generating a new set of credentials (e.g. JWT) which then will be forwarded to the upstream server.  Mutations are performed iteratively from index 0 to n and should all succeed in order for the HTTP request to be forwarded. |  [optional]
**upstream** | [**Upstream**](Upstream.md) |  |  [optional]



