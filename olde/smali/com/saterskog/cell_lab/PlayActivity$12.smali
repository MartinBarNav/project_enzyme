.class final Lcom/saterskog/cell_lab/PlayActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 674
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$12;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 678
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$12;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;)V

    .line 679
    return-void
.end method
