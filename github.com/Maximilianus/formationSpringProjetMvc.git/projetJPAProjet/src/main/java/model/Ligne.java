package model;

public class Ligne 
{
	private int qte;
	private Article article;
	
	
	public Ligne() {}
	
	public Ligne(int qte, Article article) 
	{
		super();
		this.qte = qte;
		this.article = article;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ligne [qte=");
		builder.append(qte);
		builder.append(", article=");
		builder.append(article);
		builder.append("]");
		return builder.toString();
	}
}
