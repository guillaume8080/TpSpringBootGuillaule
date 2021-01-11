<#import "/spring.ftl" as spring/>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Exchange</title>
<link rel="stylesheet"
type="text/css" href="<@spring.url '/css/app.css'/>"/>
</head>
<body>
<form action="" method="POST" class="form-example">
<div class="form-example">
<label for="Currency in">Enter from currency: </label>
<input type="text" name="from" id="currencyin" required>
</div>
<div class="form-example">
<label for="Currency out">Enter to currency: </label>
<input type="text" name="to" id="currencyout" required>
</div>
<div class="form-example">
<label for="Amount">Enter amount: </label>
<input type="number" name="amount" id="amount" required>
</div>
<div class="form-example">
<input type="submit" value="Submit">
</div>
</form>
<#if result??>
<h1>${result}</h1>
</#if>
</body>
</html>