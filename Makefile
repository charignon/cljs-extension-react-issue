all:
	lein cljsbuild once min
	cp resources/public/js/compiled/prod/clext2.js extension/main.js
	@echo "load the extension"
	@echo "visit https://developer.mozilla.org/en-US/docs/Mozilla/Add-ons/WebExtensions/Your_first_WebExtension"
	@echo "and scroll to the bottom of the page"

