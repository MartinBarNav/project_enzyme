.class final Landroid/support/v4/app/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Landroid/support/v4/app/c$b;

.field final synthetic e:Z

.field final synthetic f:Landroid/support/v4/app/d;

.field final synthetic g:Landroid/support/v4/app/d;

.field final synthetic h:Landroid/support/v4/app/c;


# direct methods
.method constructor <init>(Landroid/support/v4/app/c;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Landroid/support/v4/app/c$b;ZLandroid/support/v4/app/d;Landroid/support/v4/app/d;)V
    .locals 0

    .prologue
    .line 1234
    iput-object p1, p0, Landroid/support/v4/app/c$2;->h:Landroid/support/v4/app/c;

    iput-object p2, p0, Landroid/support/v4/app/c$2;->a:Landroid/view/View;

    iput-object p3, p0, Landroid/support/v4/app/c$2;->b:Ljava/lang/Object;

    iput-object p4, p0, Landroid/support/v4/app/c$2;->c:Ljava/util/ArrayList;

    iput-object p5, p0, Landroid/support/v4/app/c$2;->d:Landroid/support/v4/app/c$b;

    iput-boolean p6, p0, Landroid/support/v4/app/c$2;->e:Z

    iput-object p7, p0, Landroid/support/v4/app/c$2;->f:Landroid/support/v4/app/d;

    iput-object p8, p0, Landroid/support/v4/app/c$2;->g:Landroid/support/v4/app/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .prologue
    .line 1237
    iget-object v0, p0, Landroid/support/v4/app/c$2;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1239
    iget-object v0, p0, Landroid/support/v4/app/c$2;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1240
    iget-object v0, p0, Landroid/support/v4/app/c$2;->b:Ljava/lang/Object;

    iget-object v1, p0, Landroid/support/v4/app/c$2;->c:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1242
    iget-object v0, p0, Landroid/support/v4/app/c$2;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1244
    iget-object v0, p0, Landroid/support/v4/app/c$2;->h:Landroid/support/v4/app/c;

    iget-object v1, p0, Landroid/support/v4/app/c$2;->d:Landroid/support/v4/app/c$b;

    iget-boolean v2, p0, Landroid/support/v4/app/c$2;->e:Z

    iget-object v3, p0, Landroid/support/v4/app/c$2;->f:Landroid/support/v4/app/d;

    invoke-static {v0, v1, v2, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c;Landroid/support/v4/app/c$b;ZLandroid/support/v4/app/d;)Landroid/support/v4/e/a;

    move-result-object v0

    .line 1246
    invoke-virtual {v0}, Landroid/support/v4/e/a;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1247
    iget-object v1, p0, Landroid/support/v4/app/c$2;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/app/c$2;->d:Landroid/support/v4/app/c$b;

    iget-object v2, v2, Landroid/support/v4/app/c$b;->d:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1251
    :goto_0
    iget-object v1, p0, Landroid/support/v4/app/c$2;->b:Ljava/lang/Object;

    iget-object v2, p0, Landroid/support/v4/app/c$2;->c:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Landroid/support/v4/app/j;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1254
    iget-object v1, p0, Landroid/support/v4/app/c$2;->h:Landroid/support/v4/app/c;

    iget-object v2, p0, Landroid/support/v4/app/c$2;->d:Landroid/support/v4/app/c$b;

    invoke-static {v1, v0, v2}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c;Landroid/support/v4/e/a;Landroid/support/v4/app/c$b;)V

    .line 1256
    iget-object v1, p0, Landroid/support/v4/app/c$2;->f:Landroid/support/v4/app/d;

    iget-object v2, p0, Landroid/support/v4/app/c$2;->g:Landroid/support/v4/app/d;

    iget-boolean v3, p0, Landroid/support/v4/app/c$2;->e:Z

    invoke-static {v1, v2, v3, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/d;Landroid/support/v4/app/d;ZLandroid/support/v4/e/a;)V

    .line 1260
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1249
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/c$2;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/support/v4/e/a;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0
.end method
