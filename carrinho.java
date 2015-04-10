class Carrinho{
	private double custotot;
	private double pesotot;
	public double desconto;
	public Produto[] produtos;

	public Carrinho(int n){
		produtos = new Produto[n];
	}
	public void add(Produto P){
		int i;
		for(i=0;i<produtos.length;i++){
			if(produtos[i]!=null){
					produtos[i] = P;
					return ;
			}
		}
	}

	public Produto remove(Produto P){
		int i;
		for(i=0;i<produtos.length;i++){
			if(produtos[i]!=null){
				if(produtos[i].nome == P.nome){
					produtos[i] = null;
					return produtos[i];
				}
			}
		}
		return null;
	}

	public Produto busca(Produto P){
		int i;
		for(i=0;i<produtos.length;i++){
			if(produtos[i]!= null){
				if(produtos[i].nome == P.nome){
					return produtos[i];
				}
			}
		}
		return null;
	}

	public double getcustotot(){
		int i;
		double aux=0;
		for(i=0;i<produtos.length;i++){
			if(produtos[i]!=null){
                aux = produtos[i].preco;
                custotot+=aux;
			}
		}
		return custotot;
	}
	public double getpesotot(){
		int i;
		double aux=0;
		for(i=0;i<produtos.length;i++){
			if(produtos[i]!=null){
                aux = produtos[i].peso;
                pesotot+=aux;
			}
		}
		return pesotot;

	}

}
