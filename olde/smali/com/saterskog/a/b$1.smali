.class public final Lcom/saterskog/a/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/a/b$e;

.field final synthetic b:Lcom/saterskog/a/b;


# direct methods
.method public constructor <init>(Lcom/saterskog/a/b;Lcom/saterskog/a/b$e;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iput-object p2, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 232
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iget-boolean v0, v0, Lcom/saterskog/a/b;->d:Z

    if-eqz v0, :cond_1

    .line 293
    :cond_0
    :goto_0
    return-void

    .line 233
    :cond_1
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const-string v1, "Billing service connected."

    invoke-virtual {v0, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    invoke-static {p2}, Lcom/a/a/a/a$a;->a(Landroid/os/IBinder;)Lcom/a/a/a/a;

    move-result-object v1

    iput-object v1, v0, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    .line 235
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iget-object v0, v0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 237
    :try_start_0
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const-string v2, "Checking for in-app billing 3 support."

    invoke-virtual {v1, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 240
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iget-object v1, v1, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v2, 0x3

    const-string v3, "inapp"

    invoke-interface {v1, v2, v0, v3}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 241
    if-eqz v1, :cond_4

    .line 242
    iget-object v0, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    new-instance v2, Lcom/saterskog/a/c;

    const-string v3, "Error checking for billing v3 support."

    invoke-direct {v2, v1, v3}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/saterskog/a/b$e;->a(Lcom/saterskog/a/c;)V

    .line 246
    :cond_2
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/a/b;->f:Z

    .line 247
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/a/b;->g:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 281
    :catch_0
    move-exception v0

    .line 282
    iget-object v1, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    if-eqz v1, :cond_3

    .line 283
    iget-object v1, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    new-instance v2, Lcom/saterskog/a/c;

    const/16 v3, -0x3e9

    const-string v4, "RemoteException while setting up in-app billing."

    invoke-direct {v2, v3, v4}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/saterskog/a/b$e;->a(Lcom/saterskog/a/c;)V

    .line 286
    :cond_3
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0

    .line 250
    :cond_4
    :try_start_1
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "In-app billing version 3 supported for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 255
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iget-object v1, v1, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v2, 0x5

    const-string v3, "subs"

    invoke-interface {v1, v2, v0, v3}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 256
    if-nez v1, :cond_5

    .line 257
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const-string v2, "Subscription re-signup AVAILABLE."

    invoke-virtual {v1, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 258
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/saterskog/a/b;->g:Z

    .line 264
    :goto_1
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iget-boolean v1, v1, Lcom/saterskog/a/b;->g:Z

    if-eqz v1, :cond_6

    .line 265
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/a/b;->f:Z

    .line 279
    :goto_2
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/a/b;->c:Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 290
    iget-object v0, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/saterskog/a/b$1;->a:Lcom/saterskog/a/b$e;

    new-instance v1, Lcom/saterskog/a/c;

    const-string v2, "Setup successful."

    invoke-direct {v1, v4, v2}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/saterskog/a/b$e;->a(Lcom/saterskog/a/c;)V

    goto/16 :goto_0

    .line 260
    :cond_5
    :try_start_2
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const-string v2, "Subscription re-signup not available."

    invoke-virtual {v1, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 261
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/saterskog/a/b;->g:Z

    goto :goto_1

    .line 268
    :cond_6
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    iget-object v1, v1, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v2, 0x3

    const-string v3, "subs"

    invoke-interface {v1, v2, v0, v3}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 269
    if-nez v0, :cond_7

    .line 270
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const-string v1, "Subscriptions AVAILABLE."

    invoke-virtual {v0, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/a/b;->f:Z

    goto :goto_2

    .line 273
    :cond_7
    iget-object v1, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Subscriptions NOT AVAILABLE. Response: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 274
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/a/b;->f:Z

    .line 275
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/a/b;->g:Z
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const-string v1, "Billing service disconnected."

    invoke-virtual {v0, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lcom/saterskog/a/b$1;->b:Lcom/saterskog/a/b;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    .line 228
    return-void
.end method
