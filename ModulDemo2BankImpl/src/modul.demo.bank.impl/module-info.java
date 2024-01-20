module modul.demo.bank.impl {
	requires modul.demo.bank;
	provides modul.demo.bank.IAccountProvider 
			with modul.demo.bank.impl.AccountProvider;
}